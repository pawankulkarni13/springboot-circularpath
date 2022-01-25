### SpringBoot Circular Path Resolver

By default, the Spring MVC framework applies the InternalResourceView class as the view resolver. 
As a result, if the @GetMapping value is the same as the view, 
the request will fail with the Circular View path error.

One possible solution would be to rename the view and change the return value in the controller method.

If we don't want to rename the view and change the return value in the controller method, then another solution is to choose another view processor for the project.

For the most common cases, we can choose the Thymeleaf Java template engine. Let's add the spring-boot-starter-thymeleaf dependency to the project:

After rebuilding the project we can run it again, and the request is successful. In this case, Thymeleaf replaces the InternalResourceView class.

Now its erroring with below

    2022-01-25 16:42:35.210 ERROR 73758 --- [    Test worker] org.thymeleaf.TemplateEngine             : [THYMELEAF][Test worker] Exception processing template "path": Error resolving template [path], template might not exist or might not be accessible by any of the configured Template Resolvers

Because no template/view is configured for it yet.
