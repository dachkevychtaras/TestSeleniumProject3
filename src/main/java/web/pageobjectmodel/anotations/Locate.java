package web.pageobjectmodel.anotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.openqa.selenium.Platform;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
@Repeatable(Locates.class)
public @interface Locate {

  Platform on() default Platform.MAC;

  String css() default "";

  String xpath() default "";

  String className() default "";

  String id() default "";

  String linkText() default "";

  String name() default "";

  String tagName() default "";

  String accessibilityId() default "";

  String appiumClassName() default "";

  String androidUIAutomator() default "";

  String iOSClassChain() default "";

  String iOSNsPredicate() default "";

  String jQuery() default "";

  String javaScript() default "";

  boolean shadowRoot() default false;
}
