import Head from 'next/head'
import AddUser from '../components/AddUser'

import Navbar from '../components/NavBar'

export default function Home({ session }) {
  return (
    <div>
      <Head>
        <title>User Management System</title>
      </Head>

      <Navbar />

      <main>
        <AddUser />
      </main>
    </div>
  )
}
