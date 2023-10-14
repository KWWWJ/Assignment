package Script.script;

public class ScriptBean implements ScriptInterface {

	private int id;
	private String name;
	private String script;
	
	public ScriptBean() {}
	
	public void setId(int id) {this.id = id;};
	public void setName(String name) {this.name = name;};
	public void setScript(String script) {this.script = script;};
	
	public int getId() {return id;};
	public String getName() {return name;};
	public String getScript() {return script;}

}
