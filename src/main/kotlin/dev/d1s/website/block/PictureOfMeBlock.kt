package dev.d1s.website.block

import dev.d1s.beam.client.app.state.BlockContext
import dev.d1s.beam.client.image
import dev.d1s.beam.commons.BlockSize
import dev.d1s.beam.commons.metadataOf

private const val IMAGE_URL = "https://s3.d1s.dev/d1s-dev/me.jpg"

suspend fun BlockContext.pictureOfMe() {
    setSize {
        BlockSize.SMALL
    }

    setEntities {
        image(url = IMAGE_URL, width = 100)
    }

    setMetadata {
        metadataOf(
            "ui.block.image.fluid" to "true"
        )
    }
}