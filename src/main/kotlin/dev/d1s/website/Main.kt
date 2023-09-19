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

package dev.d1s.website

import dev.d1s.beam.client.app.ApplicationContext
import dev.d1s.beam.client.app.BeamClientApplication
import dev.d1s.beam.client.app.run
import dev.d1s.beam.client.app.state.block
import dev.d1s.website.block.*
import dev.d1s.website.space.rootSpace
import dev.d1s.website.translation.englishTranslation
import dev.d1s.website.translation.russianTranslation

class WebsiteApplication : BeamClientApplication() {

    override suspend fun ApplicationContext.run() {
        rootSpace {
            englishTranslation()
            russianTranslation()

            block {
                pictureOfMe()
            }

            block {
                intro()
            }

            block {
                whatIsThis()
            }

            block {
                whatAmIDoing()
            }

            block {
                contacts()
            }
        }
    }
}

fun main() {
    run(WebsiteApplication())
}