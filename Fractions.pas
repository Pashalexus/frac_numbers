var frac1, frac2, frac3: array[1..2] of Integer;
procedure rat(var f1, f2:Integer);
begin
  var rat: double := f1 / f2;
  write(rat:3:3);
end;
procedure euclide(var f11, f22: integer);
begin
  var x := abs(f11);
  var y := abs(f22);
  while (x<>0) and (y<>0) do
    if (x>y) then
      x := x mod y
    else
      y := y mod x;
  var z := max(x, y);
  if (z<>0) then
  begin
    f11 := f11 div z;
    f22 := f22 div z;
  end;
end;
procedure comb(var f111, f222: integer);
begin
  var z1 := abs(f222);
  var y1 := abs(f111) mod z1;
  var x1 := f111 div f222;
  if (f111 * f222 < 0) then write('-');
  if (x1<>0) then write(abs(x1),' ');
  if (y1<>0) then write(y1,'/',z1);
  if (x1=0) and (y1=0) then write('0')
end;
begin
  println('Введите числитель и знаменатель первой и затем второй дроби');
  readln(frac1[1], frac1[2], frac2[1], frac2[2]);
  frac3[1] := frac1[1] * frac2[2] + frac1[2] * frac2[1];
  frac3[2] := frac1[2] * frac2[2];
  euclide(frac3[1], frac3[2]);
  print('sum =', frac3[1], '/', frac3[2], '=');
  rat(frac3[1], frac3[2]);
  print(' =');
  comb(frac3[1], frac3[2]);
  println;
  frac3[1] := frac1[1] * frac2[2] - frac1[2] * frac2[1];
  frac3[2] := frac1[2] * frac2[2];
  euclide(frac3[1], frac3[2]);
  print('sub =', frac3[1], '/', frac3[2], '=');
  rat(frac3[1], frac3[2]);
  print(' =');
  comb(frac3[1], frac3[2]);
  println;
  frac3[1] := frac1[1] * frac2[1];
  frac3[2] := frac1[2] * frac2[2];
  euclide(frac3[1], frac3[2]);
  print('mul =', frac3[1], '/', frac3[2], '=');
  rat(frac3[1], frac3[2]);
  print(' =');
  comb(frac3[1], frac3[2]);
  println;
  frac3[1] := frac1[1] * frac2[2];
  frac3[2] := frac1[2] * frac2[1];
  euclide(frac3[1], frac3[2]);
  print('div =', frac3[1], '/', frac3[2], '=');
  rat(frac3[1], frac3[2]);
  print(' =');
  comb(frac3[1], frac3[2]);
end.