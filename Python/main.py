from car import Car

if __name__ == "__main__":
    car = Car()
    car.license = "ASD123"
    car.driver = "QWE EWQ"    
    print(vars(car))

    car2 = Car()
    car2.license = "ASD456"
    car2.driver = "IUY YIU"
    print(vars(car2))
