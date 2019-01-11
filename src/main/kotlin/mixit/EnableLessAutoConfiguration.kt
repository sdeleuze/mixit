package mixit

import java.lang.annotation.Documented
import java.lang.annotation.Inherited
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

import org.springframework.boot.autoconfigure.ImportAutoConfiguration
import kotlin.reflect.KClass

@Target(AnnotationTarget.CLASS, AnnotationTarget.FILE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@ImportAutoConfiguration
annotation class EnableLessAutoConfiguration(val exclude: Array<KClass<*>> = [], val excludeName: Array<String> = []) {
    companion object {

        val ENABLED_OVERRIDE_PROPERTY = "spring.boot.enableautoconfiguration"
    }

}
