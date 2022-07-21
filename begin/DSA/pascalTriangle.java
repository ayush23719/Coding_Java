public class Solution {
	public List<List<Integer>> generate(int numRows) {
List<List<Integer>> triangle = new ArrayList<>();
		if (numRows < 1 ||  numRows > 30 )
			return triangle;

		for (int line = 1; line <= numRows; line ++){
			List<Integer> row = new ArrayList<>();
			int c = 1;
			for (int i = 1 ; i <= line ; i++){
				row.add(c);
				c = c *(line - i)/i;
			}
			triangle.add(row);
		}

		return triangle;
	}   
} {
    
}
