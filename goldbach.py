#哥德巴赫猜想 (這玩意兒很燒腦)
#任一大於 2 的偶數, 都可表示成兩個質數之和
#以前 14=2*7
#現在 14=3+11 (這是人類的進步)
def goldbach(n, pAry):
	for p1 in pAry:
		for p2 in pAry:
			
            		if (p2>=p1)&((p1+p2) == n):
            			print (str(n), '=', str(p1), 'U', str(p2))
            			return

	print('input another even num please') # end for p1
	
pAry = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37]
ans=goldbach(40, pAry)	#回傳單調 (遞增) 級數 3+37
