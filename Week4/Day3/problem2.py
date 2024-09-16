# // Gold Mine Problem
# // Last Updated : 06 Feb, 2023
# // Generative Summary
# // Now you can generate the summary of any article of your choice.
# // Got it
# // Given a gold mine of n*m dimensions. Each field in this mine contains a positive integer which is the amount of gold in tons. Initially, the miner is in the first column but can be in any row. He can move only (right->,right up /,right down\) that is from a given cell, the miner can move to the cell diagonally up towards the right or diagonally down towards the right. Find out the maximum amount of gold he can collect. 




def Goldmine(grid):
  def dfs(x,y):
      if x < 0 or y < 0 or x >= len(grid) or y >= len(grid[0]) or grid[x][y] == 0:
        return 0
      gold = grid[x][y]
      grid[x][y] = 0
      upsum = dfs(x-1,y)
      downsum = dfs(x+1,y)
      leftsum = dfs(x,y-1)
      rightsum = dfs(x,y+1)
      grid[x][y] = gold
      return gold + max(leftsum,rightsum,upsum,rightsum)
  max_gold = 0  
  for i in range(len(grid)):
    for j in range(len(grid[0])):
      if grid[i][j] != 0:
         max_gold = max(max_gold,dfs(i,j))
  return max_gold
 
n,m = map(int,input().split())
grid = []
for i in range(m):
    row = list(map(int,input().split()))
    grid.append(row)
print(Goldmine(grid))