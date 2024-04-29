# currency-exchange-service

Dynamic port return
Go to Run Configuration -> Rename the already created application as currency-exchange-service8000(It will run on the port as mentioned in propertie file)
Create a duplicate application and rename currency-exchange-service8001 (it will run on the port mentioned in Vm arguments)
-Dserver.port=8001

h2Db console URL:- http://localhost:8000/h2-console
------
api-uri:-
http://localhost:8000/currency-exchange/from/EUR/to/INR

------
if exponential-backoff is true
the time duration of retry will be exponentially increasing