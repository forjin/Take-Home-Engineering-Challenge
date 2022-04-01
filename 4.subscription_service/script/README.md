# Take Home Engineering Challenge

The Australian Payments Network is the organisation that manages the BSB numbers in Australia. You are tasked one day by the team to provide a system that subscribe to the changes of the BSB numbers, and provide the BSB information to other teams' software to consume as a service.

## Functional Requirements

BSB numbers are published here: https://bsb.auspaynet.com.au/

Other teams would like to consume your service in a few ways:

- Be able to get the full list BSB records
- Be able to query a BSB record using the 6-digit BSB number
- Be notified if any BSB record has changed
  - Other teams are open to how you want to notify them and willing to build their software around what you offer

## Non-functional Requirements

- Your system should be able to authenticate requests so that only authorised callers can query your system.
- You need some means to monitor:
  - The application to make sure the data is up-to-date.
  - Requests coming in so that you are confident the service is healthy.
- You are only serving a couple of teams with a few requests per second, but the number of requests are expected to increase dramatically if your service is proven to be reliable and performant.
- You and your team also would like to run some reports to better understand how people are using the service, but they are not sure what they are looking for at this moment so they are open to suggestions.

## Other notes

- There's no limit on your technology stack or hosting infrastructure.
- It is highly encouraged if you could document your assumptions during the implementation.
- Expected time to complete this challenge is around 6-8 hours. It's fine if you don't have time to implement everything, but please document your thought process and plans.
