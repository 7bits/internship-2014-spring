package it.sevenbits.internship.web.validator;

import it.sevenbits.internship.web.form.EntityForm;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


/**
 */
@Component
public class EntityFormValidator implements Validator {

    public boolean supports(final Class clazz) {
        return EntityForm.class.equals(clazz);
    }

    public void validate(final Object object, final Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "Cannot be empty", "Cannot be empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "Cannot be empty", "Cannot be empty");
    }
}
