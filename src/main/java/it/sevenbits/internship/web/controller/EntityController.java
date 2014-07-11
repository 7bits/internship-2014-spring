package it.sevenbits.internship.web.controller;

import it.sevenbits.internship.repository.EntityMapper;
import it.sevenbits.internship.web.form.EntityForm;
import it.sevenbits.internship.web.validator.EntityFormValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * Не забываем писать коментарии
 *
 */
@Controller
public class EntityController {

    @Autowired
    private EntityFormValidator entityFormValidator;
    @Autowired
    private EntityMapper entityMapper;

    @RequestMapping(value = "/createEntity", method = RequestMethod.GET)
    public ModelAndView welcome() {
        ModelAndView mav = new ModelAndView("create-entity");
        EntityForm entityForm = new EntityForm();
        mav.addObject(entityForm);

        return mav;
    }

    @RequestMapping(value = "/createEntity", method = RequestMethod.POST)
    public ModelAndView saveEntity(
            final HttpServletRequest request,
            final HttpServletResponse response,
            @Valid @ModelAttribute("entityForm") final EntityForm entityForm,
            final BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            ModelAndView model = new ModelAndView("create-entity");
            model.addObject("entityForm", entityForm);
            return model;
        }

        entityMapper.create(entityForm.fillModel());

        return new ModelAndView("success");
    }

    @InitBinder("entityForm")
    protected void initSurveyListFormBinder(final WebDataBinder binder) {
        binder.setValidator(entityFormValidator);
    }
}
