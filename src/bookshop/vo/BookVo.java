package bookshop.vo;

public class BookVo {

	private Long no;
	private String title;
	private String status;

	private Long authorNo;
	private String authorName;

	public BookVo() {
		super();
	}

	public BookVo(Long no, String title, String status) {
		super();
		this.no = no;
		this.title = title;
		this.status = status;
	}

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getAuthorNo() {
		return authorNo;
	}

	public void setAuthorNo(Long authorNo) {
		this.authorNo = authorNo;
	}

	public String getauthorName() {
		return authorName;
	}

	public void setauthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "BookVo [no=" + no + ", title=" + title + ", status=" + status + ", authorNo=" + authorNo
				+ ", authorName=" + authorName + "]";
	}

}
