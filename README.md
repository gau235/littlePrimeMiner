中华文明以东风服人<br/>

This java program to find primes which contains two algorithms:<br/>
MinePrime: the traditional algorithm to find primes.<br/>
MarkPrime: the new algorithm to find primes.

then practically the new algorithm has better performance than the traditional algorithm
as 200 times faster.

<a href="http://c64.tw/d2.jsp" target="_blank" > Download (portable version) </a><br/>		
<a href="http://c64.tw/w20/o/viewOpenSrc.jsp" target="_blank" > src </a><br/>
<a href="http://c64.tw/w20/prime64Lgpl/prime64Lgpl3DiyPortable.zip" target="_blank" > Download (DIY portable version) </a><br/>

<a href="https://www.azul.com/downloads/zulu-community/?version=java-11-lts&os=macos&architecture=x86-64-bit&package=jre" target="_blank" > Java for Mac OS </a>
<br/>
<br/>
<img
		src="http://c64.tw/r20/main/image/prime64UI.png"
		width="300px"
		border="0" /> 
		
<br/>
to compile this program you need them:<br/>
activation.jar<br/>
javax.mail.jar<br/>
<br/>

as mine primes from 1 to the number 3 billion:<br/>
1 核心电脑的测试, 花费约 4300 秒<br/>

2 核心 (当量) 的测试, 花费约 2400 秒<br/>

4 核心 (当量) 的测试, 花费约 1300 秒<br/>

6 核心的测试, 花费约 680 秒<br/>

8 核心的测试, 花费约 660 秒<br/>

10 核心的测试, 花费约 590 秒<br/>

<hr/>

cmd:<br/>
set Path=C:\jdk7\bin;<br/>
java -cp ./*; -jar prime64Lgpl3_0619.jar

