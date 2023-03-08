# 변수 value 선언
value = 0

# 연산 결과를 변수 result의 초기값으로 대입
result = value + 10

# 변수 result 값을 읽고 콘솔에 출력
print(result)

hour = 3
minute = 5
print(str(hour) + "시간 " + str(minute) + "분 ")

totalMinute = (hour*60) + minute
print("총 " + str(totalMinute) + "분")

x, y = 3, 5
print("x:" + str(x) + ", y:" + str(y))
#
# temp = x;
# x = y
# y = temp
x, y = y, x

print("x:" + str(x) + ", y:" + str(y))