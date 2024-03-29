/*
 * Copyright 2023-2024 Mikhail Titov
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

package dev.d1s.website.block.root

import dev.d1s.beam.client.app.state.SpaceContext
import dev.d1s.beam.client.app.state.smallBlock
import dev.d1s.beam.client.fullWidthImage
import dev.d1s.beam.client.setBlockImageEntityFluid

private const val IMAGE_URL = "https://s3.d1s.dev/d1s-dev/me.jpg"

suspend fun SpaceContext.pictureOfMe() {
    smallBlock {
        setEntities {
            fullWidthImage(url = IMAGE_URL)
        }

        setMetadata {
            setBlockImageEntityFluid()
        }
    }
}