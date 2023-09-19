package dev.d1s.website.block

import dev.d1s.beam.client.ContentEntitiesBuilder
import dev.d1s.beam.client.app.state.BlockContext
import dev.d1s.beam.client.buttonLink
import dev.d1s.beam.client.text
import dev.d1s.beam.commons.BlockSize
import dev.d1s.beam.commons.asTemplate
import dev.d1s.website.translation.WebsiteTranslation

suspend fun BlockContext.whatAmIDoing() {
    setSize {
        BlockSize.MEDIUM
    }

    setEntities {
        heading()
        text()
        businessLink()
    }
}

private fun ContentEntitiesBuilder.heading() {
    text(value = WebsiteTranslation.LOCATION_WHAT_AM_I_DOING_HEADING.asTemplate, heading = "h2")
}

private fun ContentEntitiesBuilder.text() {
    text(value = WebsiteTranslation.LOCATION_WHAT_AM_I_DOING_FIRST_PARAGRAPH.asTemplate)
    text(value = WebsiteTranslation.LOCATION_WHAT_AM_I_DOING_SECOND_PARAGRAPH.asTemplate)
}

private fun ContentEntitiesBuilder.businessLink() {
    buttonLink(
        text = WebsiteTranslation.LOCATION_WHAT_AM_I_DOING_BUSINESS_WEBSITE_TEXT.asTemplate,
        url = WebsiteTranslation.LOCATION_WHAT_AM_I_DOING_BUSINESS_WEBSITE_URL.asTemplate,
        width = 100
    )
}