package mixit.util

import org.springframework.web.reactive.function.server.HandlerStrategies
import org.springframework.web.reactive.function.server.RenderingResponse
import org.springframework.web.server.ServerWebExchange

// TODO Provide such helper class directly in Spring WebFlux
open class RenderingResponseWrapper(val delegate: RenderingResponse) : RenderingResponse {

    override fun statusCode() = delegate.statusCode()

    override fun writeTo(exchange: ServerWebExchange, strategies: HandlerStrategies) = delegate.writeTo(exchange, strategies)

    override fun headers() = delegate.headers()

    override fun model() = delegate.model()

    override fun name() = delegate.name()
}


