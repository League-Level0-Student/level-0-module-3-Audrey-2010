//99 bottles of beer on the wall, 99 bottles of beer.
//Take one down, pass it around, 98 bottles of beer on the wall
for (int i=99; i>0; i--){
  if (i==1){
     println( i+" bottle of beer on the wall, "+i+" bottle of beer.Take one down, pass it around,  No more bottles of beer on the wall... ");
  }
  else if (i==2){
     println( i+" bottles of beer on the wall, "+i+" bottles of beer.Take one down, pass it around, "+(i-1)+" bottle of beer on the wall... ");
  }
  else {println( i+" bottles of beer on the wall, "+i+" bottles of beer.Take one down, pass it around, "+(i-1)+" bottles of beer on the wall... ");
  }
  
  
  
}
println(  "No more bottles of beer on the wall, no more bottles of beer, go to the store and buy some more, 99 bottles of beer");
