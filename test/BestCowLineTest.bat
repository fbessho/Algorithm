(echo 1 && echo A) | java -cp ..\out\production\HuntingG pcc.BestCowLine 

echo ---------

(echo 4 && echo B && echo A && echo C && echo B) | java -cp ..\out\production\HuntingG pcc.BestCowLine 

echo Expected: BABC
echo ---------

(echo 4 && echo B && echo C && echo A && echo B) | java -cp ..\out\production\HuntingG pcc.BestCowLine 

echo Expected: BABC
echo ---------

pause
