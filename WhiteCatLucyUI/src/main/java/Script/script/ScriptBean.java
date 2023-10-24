package Script.script;

public class ScriptBean implements ScriptInterface {

	private int id;
	private int order;
	private String where;
	private String script;
	private String img;
	
	
	public ScriptBean() {}
	
	public void setId(int id) {this.id = id;};
	public int getId() {return id;};
	
	public void setWhere(String where) {this.where = where;};
	public String getWhere() {return where;};
	
	public void setScript(String script) {this.script = script;};
	public String getScript() {return script;}
	
	public void setImg(String img) {this.img = img;}
	public String getImg() {return img;}
	
	public void setOrder(int order) {this.order = order;}
	public int getOrder() {return order;}

}
