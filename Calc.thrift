
struct Message {
  1: string mes
}

service Calc {
	i32 add(1:i32 num1, 2:i32 num2),
	Message hello(1:Message name)
}
