import { NextResponse, NextRequest } from 'next/server'
export default function send(request) {
    const body = request.body
    let user = JSON.stringify(body)
    const data = {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: user
    }
    const statusCode = fetch('http://localhost:9090/registration', data).then(res => {
        if (res.status === 200)
          NextResponse.redirect('/')
        else
        console.log('error')
    })
}

