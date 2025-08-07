<?php
// Script koneksi database
$host = 'localhost'; // Host database
$user = 'root';      // Username database
$pass = '';          // Password database
$db   = 'db_akademik'; // Nama database

$conn = mysqli_connect($host, $user, $pass, $db);

// Periksa koneksi
if (!$conn) {
    die("Koneksi gagal: " . mysqli_connect_error());
}
?>

<!DOCTYPE html>
<html>

<head>
    <title>Join Table</title>
</head>

<body>
    <table border="1">
        <tr>
            <td>No.</td>
            <td>NIS.</td>
            <td>Nama</td>
            <td>Kota</td>
            <td>Kode Mata Pelajaran</td>
            <td>Nilai</td>
        </tr>

        <?php
        // Query untuk join tabel
        $query = mysqli_query($conn, "
             SELECT nilai.id, siswa.*, nilai.kode_mp, nilai.nilai as nilai from siswa inner join nilai on siswa.nis = nilai.nis order by id");

        // Periksa jika query berhasil
        if ($query && mysqli_num_rows($query) > 0) {
            $no = 1;
            foreach ($query as $row) : ?>
                <tr>
                    <td><?= $no++; ?></td>
                    <td><?= $row['nis']; ?></td>
                    <td><?= $row['nama']; ?></td>
                    <td><?= $row['kota']; ?></td>
                    <td><?= $row['kode_mp']; ?></td>
                    <td><?= $row['nilai']; ?></td>
                </tr>
        <?php endforeach;
        } else {
            echo "<tr><td colspan='6'>Tidak ada data yang ditemukan.</td></tr>";
        }
        ?>
    </table>
</body>

</html>