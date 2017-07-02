def product(f: Int=>Int) (a: Int, b: Int) :Int =
  if (a > b) 1
  else f(a)*product(f)(a+1,b)

product(x=>x)(1,3)

def fact(x: Int) = product(x=>x)(1,x)


fact(3)


