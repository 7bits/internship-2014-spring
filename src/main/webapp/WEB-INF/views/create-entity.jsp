<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form modelAttribute="entityForm" action="createEntity" method="post">
    <div >
        <form:label path="name" >
            <strong>
                Name:
            </strong>
            <form:input path="name" />
                <br>
                <form:errors element="span" path="name" ></form:errors>
        </form:label>
        <br>
        <form:label path="description" >
            <strong>
                Description:
            </strong>
            <form:input path="description" />
                <br>
                <form:errors element="span" path="description" ></form:errors>
        </form:label>
    </div>
    <input type="submit" value="Save"/>
</form:form>
