package dev.d1s.website.block

import com.sksamuel.hoplite.fp.valid
import dev.d1s.beam.client.ContentEntitiesBuilder
import dev.d1s.beam.client.app.state.BlockContext
import dev.d1s.beam.client.buttonLink
import dev.d1s.beam.client.text
import dev.d1s.beam.commons.BlockSize
import dev.d1s.beam.commons.asTemplate
import dev.d1s.beam.commons.contententity.ButtonLinkContentEntityTypeDefinition
import dev.d1s.beam.commons.contententity.Text
import dev.d1s.website.translation.WebsiteTranslation

suspend fun BlockContext.contacts() {
    setSize {
        BlockSize.MEDIUM
    }

    setEntities {
        heading()
        text()
        links()
    }
}

private fun ContentEntitiesBuilder.heading() {
    text(value = WebsiteTranslation.LOCATION_CONTACTS_HEADING.asTemplate, heading = "h2")
}

private fun ContentEntitiesBuilder.text() {
    text(value = WebsiteTranslation.LOCATION_CONTACTS_TEXT.asTemplate)
}

private fun ContentEntitiesBuilder.links() {
    buttonLink(
        text = WebsiteTranslation.LOCATION_CONTACTS_TELEGRAM_TEXT.asTemplate,
        url = WebsiteTranslation.LOCATION_CONTACTS_TELEGRAM_URL.asTemplate,
        style = ButtonLinkContentEntityTypeDefinition.Style.INFO,
        width = 100
    )
}