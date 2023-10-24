package Script.script;

public interface ScriptInterface {

	public void setId(int id);
	public void setOrder(int order);
	public void setWhere(String where);
	public void setScript(String userId);
	public void setImg(String img);
	
	public int getId();
	public int getOrder();
	public String getWhere();
	public String getScript();
	public String getImg();
}