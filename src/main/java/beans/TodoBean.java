package beans;

public class TodoBean {
	private int id;
	private String taskname;
	private String taskurl;

    public TodoBean() {
    }
    
    public TodoBean(int id, String taskname, String taskurl) {
        this.id = id;
        this.taskname = taskname;
        this.taskurl = taskurl;
    }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	public String getTaskurl() {
		return taskurl;
	}
	public void setTaskurl(String taskurl) {
		this.taskurl = taskurl;
	}

}
