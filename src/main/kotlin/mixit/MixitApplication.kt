package mixit

import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.autoconfigure.AutoConfigurationExcludeFilter
import org.springframework.boot.context.TypeExcludeFilter
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.FilterType


@SpringBootConfiguration
@ComponentScan(excludeFilters = [ComponentScan.Filter(type = FilterType.CUSTOM, classes = arrayOf(TypeExcludeFilter::class)), ComponentScan.Filter(type = FilterType.CUSTOM, classes = arrayOf(AutoConfigurationExcludeFilter::class))])
@EnableLessAutoConfiguration
@EnableConfigurationProperties(MixitProperties::class)
class MixitApplication

fun main(args: Array<String>) {
    runApplication<MixitApplication>(*args)
}
