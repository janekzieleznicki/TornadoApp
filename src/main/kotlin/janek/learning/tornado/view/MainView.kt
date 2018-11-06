package janek.learning.tornado.view

import javafx.scene.layout.BorderPane
import tornadofx.*

class MainView : View("My View") {
    override val root: BorderPane by fxml()
}
