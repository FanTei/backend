import Head from 'next/head'
import styles from '../styles/Home.module.css'

export default function Home() {
    return (
        <div className={styles.container}>
            <Head>
                <title>File Server</title>
                <meta name="description" content="Home file server"/>
            </Head>
            <main className={styles.main}>
                <h1 className={styles.title}>
                    Welcome
                </h1>
                <div className={styles.grid}>
                    <a href="loginPage" className={styles.card}>
                        <h2>Login &rarr;</h2>
                        <p>Login</p>
                    </a>
                    <a href="registrationPage" className={styles.card}>
                        <h2>Registration &rarr;</h2>
                        <p>Registration account</p>
                    </a>
                </div>
            </main>
        </div>
    )
}
