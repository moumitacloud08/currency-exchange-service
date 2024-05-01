# currency-exchange-service

Dynamic port return
Go to Run Configuration -> Rename the already created application as currency-exchange-service8000(It will run on the port as mentioned in propertie file)
Create a duplicate application and rename currency-exchange-service8001 (it will run on the port mentioned in Vm arguments)
-Dserver.port=8001

h2Db console URL:- http://localhost:8000/h2-console

------
if exponential-backoff is true
the time duration of retry will be exponentially increasing

-----------------Services----------------
currency-exchange API URL:-
http://localhost:8000/currency-exchange/from/EUR/to/INR

currency-conversion API URL:-
http://localhost:8100/currency-converter/from/USD/to/INR/quantity/1000

currency-conversion Feign LoadBalancing URI:- 
http://localhost:8100/currency-converter-feign/from/USD/to/INR/quantity/1000

------------------EUREKA---------------------------
http://localhost:8761/

--------------------APIGATEWAY------------------------

APIGateway URIs:-

- http://localhost:8765/CURRENCY-EXCHANGE-SERVICE/currency-exchange/from/EUR/to/INR

- http://localhost:8765/CURRENCY-CONVERSION-SERVICE/currency-converter/from/USD/to/INR/quantity/1000

- http://localhost:8765/CURRENCY-CONVERSION-SERVICE/currency-converter-feign/from/USD/to/INR/quantity/1000

----APIGateway URIs lowercase-----

- http://localhost:8765/currency-exchange-service/currency-exchange/from/EUR/to/INR

- http://localhost:8765/currency-conversion-service/currency-converter/from/USD/to/INR/quantity/1000

- http://localhost:8765/currency-conversion-service/currency-converter-feign/from/USD/to/INR/quantity/1000

------APIGateway URIs CUSTOM ROUTE--------

http://localhost:8765/currency-exchange/from/EUR/to/INR
http://localhost:8765/currency-converter/from/USD/to/INR/quantity/1000
http://localhost:8765/currency-converter-feign/from/USD/to/INR/quantity/1000
http://localhost:8765/currency-converter-new/from/USD/to/INR/quantity/1000

----------Zipkin--------------
http://localhost:9411/zipkin