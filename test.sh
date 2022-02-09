
result=`git status -s`

if [ "$result" = "" ]
then
  echo "result is empty"
else
  echo "result is not empty !"
  echo "$result"
fi