BEGIN{
drop=0;
}
{
if($1=="d")
{
drop++;
printf("%s\t%s\n",$5,$11);
}
}
END{
printf("Total number of %s packets dropped due to congestion =%d\n",$5,drop);
}
