package ch11;

public class MakeReport {
	
	StringBuffer buffer=new StringBuffer();
	// String class를 쭉 더해서쓰는 방법 중 하.
	// + + 로 쓸 수도 있지만, 메모리 overhead 가 상당히 크다
	// 내부적으로 버퍼를 가지고 있는 class에 string을 연결하고 결과를 string으로
	// return 한다
	
	
	private String line="===========================================\n";
	private String title = "  name\t   address \t\t  phon  \n";
	
	private void makeHeader()
	{
		buffer.append(line); // string builder를 사
		buffer.append(title);
		buffer.append(line);
	}
	
	private void generateBody()
	{
		
		buffer.append("James \t");
		buffer.append("Seoul Korea \t");
		buffer.append("010-2222-3333\n");
		
		buffer.append("Tomas \t");
		buffer.append("Newyork US \t");
		buffer.append("010-7777-8888\n");
	}
	
	private void makeFooter()
	{
		buffer.append(line);
	}
	// 이 메서드만 public임 
	// 외부에서 쓸 수 있는 메서드는 getReport 뿐
	//
	public String getReport() {
		makeHeader();
		generateBody();
		makeFooter();
		return buffer.toString();
		
	}
	

}
