package gate.opennlp;

import gate.creole.PackagedController;
import gate.creole.metadata.AutoInstance;
import gate.creole.metadata.AutoInstanceParam;
import gate.creole.metadata.CreoleParameter;
import gate.creole.metadata.CreoleResource;

import java.net.URL;
import java.util.List;

@CreoleResource(name = "OpenNLP IE System",
    comment = "OpenNLP Information Extraction System",
    autoinstances = @AutoInstance(parameters = {
	@AutoInstanceParam(name="pipelineURL", value="resources/opennlp.gapp"),
	@AutoInstanceParam(name="menu", value="OpenNLP")}))
public class OpenNLP extends PackagedController {

}
