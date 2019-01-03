package mixit

import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.autoconfigure.AutoConfigurationExcludeFilter
import org.springframework.boot.autoconfigure.ImportAutoConfiguration
import org.springframework.boot.context.TypeExcludeFilter
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.FilterType


@SpringBootConfiguration
@ComponentScan(excludeFilters = [ComponentScan.Filter(type = FilterType.CUSTOM, classes = arrayOf(TypeExcludeFilter::class)), ComponentScan.Filter(type = FilterType.CUSTOM, classes = arrayOf(AutoConfigurationExcludeFilter::class))])
@ImportAutoConfiguration(value = [org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration::class,
    org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration::class,
    org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration::class,
    org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration::class,
    org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration::class,
    org.springframework.boot.autoconfigure.data.mongo.MongoReactiveDataAutoConfiguration::class,
    org.springframework.boot.autoconfigure.data.mongo.MongoReactiveRepositoriesAutoConfiguration::class,
    org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration::class,
    org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration::class,
    org.springframework.boot.autoconfigure.http.codec.CodecsAutoConfiguration::class,
    org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration::class,
    org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration::class,
    org.springframework.boot.autoconfigure.mail.MailSenderAutoConfiguration::class,
    org.springframework.boot.autoconfigure.mail.MailSenderValidatorAutoConfiguration::class,
    org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration::class,
    org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration::class,
    org.springframework.boot.autoconfigure.mongo.MongoReactiveAutoConfiguration::class,
    org.springframework.boot.autoconfigure.mustache.MustacheAutoConfiguration::class,
    org.springframework.boot.autoconfigure.reactor.core.ReactorCoreAutoConfiguration::class,
    org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration::class,
    org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration::class,
    org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerFactoryAutoConfiguration::class,
    org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration::class,
    org.springframework.boot.autoconfigure.web.reactive.error.ErrorWebFluxAutoConfiguration::class,
    org.springframework.boot.autoconfigure.web.reactive.function.client.ClientHttpConnectorAutoConfiguration::class,
    org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration::class])
@EnableConfigurationProperties(MixitProperties::class)
class MixitApplication

fun main(args: Array<String>) {
    runApplication<MixitApplication>(*args)
}
