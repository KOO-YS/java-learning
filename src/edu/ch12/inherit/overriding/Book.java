package edu.ch12.inherit.overriding;

public class Book {
	private String title;
	private String author;
	private int price;
	
	public Book() {}
	
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
//	@Override
//	public String toString() {
//		return "title=" + title + ", author=" + author + ", price=" + price;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if(this == obj) {	// 객체의 주소가 같으면 같은 객체
//			return true;
//		}
//		if(obj == null) {	// 전달받은 객체가 null
//			return false;
//		}
//		/* 각각의 필드 서로 비교 */
//		Book other = (Book)obj;	// 형변환
//		// 원본객체의 제목이 널이면 비교할 객체의 
//		if(title == null) {
//			if(other.title != null) {
//				return false;
//			}
//		} else if(!title.equals(other.title)) {	// 두 객체의 이름이 서로 다른경우 false return
//			return false;
//		}
//		if(author == null) {
//			if(other.author != null) {
//				return false;
//			}
//		} else if(!author.equals(other.author)) {	// 두 객체의 작가가 서로 다른경우 false return
//			return false;
//		}	
//		// 기본자료형인 가격 -> null 없다
//		if(price != other.price) {
//			return false;
//		}
//		// 모든 조건을 통과하면 두 객체는 같은 객체 
//		return true;
//	}
//	@Override
//	public int hashCode() {
//		/* hashCode :: 객체 인식용 정수 */
//		return (title+author+price).hashCode();	// 이거 뭔말
//	}
//	
	
	
}
