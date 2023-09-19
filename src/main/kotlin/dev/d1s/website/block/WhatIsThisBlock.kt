package dev.d1s.website.block

import dev.d1s.beam.client.ContentEntitiesBuilder
import dev.d1s.beam.client.app.state.BlockContext
import dev.d1s.beam.client.text
import dev.d1s.beam.commons.BlockSize
import dev.d1s.beam.commons.asTemplate
import dev.d1s.beam.commons.contententity.Text
import dev.d1s.website.translation.WebsiteTranslation

suspend fun BlockContext.whatIsThis() {
    setSize {
        BlockSize.MEDIUM
    }

    setEntities {
        heading()
        text()
    }
}

private fun ContentEntitiesBuilder.heading() {
    text(value = WebsiteTranslation.LOCATION_WHAT_IS_THIS_HEADING.asTemplate, heading = "h2")
}

private fun ContentEntitiesBuilder.text() {
    text(value = WebsiteTranslation.LOCATION_WHAT_IS_THIS_TEXT_FIRST_PARAGRAPH.asTemplate)
    text(value = WebsiteTranslation.LOCATION_WHAT_IS_THIS_TEXT_SECOND_PARAGRAPH.asTemplate)
}