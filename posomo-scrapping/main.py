import time
import warnings
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

if __name__ == '__main__':
    # Chrome의 경우 | 아까 받은 chromedriver의 위치를 지정해준다.
    print('hello world')
    driver = webdriver.Chrome('chromedriver')
    # PhantomJS의 경우 | 아까 받은 PhantomJS의 위치를 지정해준다.
    driver.get("https://map.naver.com/v5/search/강남구%20음식점")  # 네이버 신 지도
    try:
        element = WebDriverWait(driver, 40).until(
            EC.presence_of_element_located((By.XPATH,"//li[@class='UEzoS rTjJo']"))
        )  # 입력창이 뜰 때까지 대기
    finally:
        pass
    f = open("scrap.txt", 'w')
    f.write(driver.page_source)
    f.close()
    driver.quit()
