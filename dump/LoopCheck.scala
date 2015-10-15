object LoopCheck {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
	   var count = 0
       for { 
		  i <- 0 to 10
		  if i % 2 == 0
		  if i > 5
		} {
			count = count + 11
			println(count)
		}
    }
}