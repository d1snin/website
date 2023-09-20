/*
 * Copyright 2023 Mikhail Titov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.d1s.website.block.securityroom

import dev.d1s.beam.client.app.state.BlockContext
import dev.d1s.beam.client.embed
import dev.d1s.beam.commons.BlockSize

private const val EMBED_URL = "https://cam2.vdonsk.ru/embed/%s"

suspend fun BlockContext.camera(embedId: String) {
    setSize {
        BlockSize.MEDIUM
    }

    setEntities {
        val url = EMBED_URL.format(embedId)

        embed(url, width = 100, height = 300)
    }
}