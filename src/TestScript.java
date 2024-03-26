import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.api.utilities.Logger;

@ScriptManifest(name = "My First script", description = "First Java script", author = "Ing Mapache",
        version = 1.0, category = Category.WOODCUTTING, image = "hSqAmVIq")
public class TestScript extends AbstractScript {
    @Override
    public int onLoop() {
        Logger.log("My first Script");

        return 0;
    }

}
