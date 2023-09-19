package dev.d1s.website.block

import dev.d1s.beam.client.ContentEntitiesBuilder
import dev.d1s.beam.client.app.state.BlockContext
import dev.d1s.beam.client.text
import dev.d1s.beam.commons.BlockSize
import dev.d1s.beam.commons.asTemplate
import dev.d1s.website.translation.WebsiteTranslation

suspend fun BlockContext.intro() {
    setSize {
        BlockSize.LARGE
    }

    setEntities {
        heading()
        text()
    }
}

private fun ContentEntitiesBuilder.heading() {
    text(value = WebsiteTranslation.LOCATION_INTRO_HEADING.asTemplate, heading = "h1")
}

private fun ContentEntitiesBuilder.text() {
    text(value = WebsiteTranslation.LOCATION_INTRO_TEXT.asTemplate)
}