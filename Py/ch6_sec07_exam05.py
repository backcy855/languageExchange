class Car:
    def __init__(self):
        self.company = '현대자동차'

    def showcar(self):
        print(self.company)

    def poweron(self):
        print("전원을 켭니다")

    def powerOff(self):
        print("전원을 끕니다")

    def plus(self, x, y):
        result = x + y
        return print(result)

hd = Car()
hd.showcar()
hd.poweron()
hd.plus(3, 4)



