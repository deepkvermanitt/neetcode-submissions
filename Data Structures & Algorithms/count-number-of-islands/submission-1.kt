class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
            var count = 0
            val queue = LinkedList<Pair<Int,Int>>()
            var rowSize = grid.size
            var colSize = grid[0].size

            for(row in 0 until rowSize){
                for(col in 0 until colSize){
                    if(grid[row][col]=='1'){
                        grid[row][col] ='0'
                        count++
                        queue.add(Pair(row,col))
                        while(!queue.isEmpty()){
                            var deltaRC = listOf(Pair(0,1),Pair(0,-1),Pair(1,0),Pair(-1,0))
                            var (ir,ic) = queue.poll()
                             for((dr,dc) in deltaRC){
                                var  adR = ir+dr
                                var  adC = ic+dc
                                if(adR>=0 && adR <rowSize && adC >=0 && adC <colSize){
                                    if(grid[adR][adC]=='1'){
                                        grid[adR][adC] = '0'
                                        queue.add(Pair(adR,adC))
                                    }
                                }
                             }
                        }

                    }
                }
            }
        
        return count
    }
}
