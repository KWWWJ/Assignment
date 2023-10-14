package Script.script;

public interface ScriptInterface {

	public void setId(int id);
	public void setName(String name);
	public void setScript(String userId);
	
	public int getId();
	public String getName();
	public String getScript();
}