package janek.learning.tornado.view

import janek.learning.tornado.app.Styles
import tornadofx.*

class SampleMainView : View("Hello TornadoFX") {
    override val root = hbox {
        label(title) {
            addClass(Styles.heading)
        }
    }
}