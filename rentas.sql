-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-06-2023 a las 10:56:26
-- Versión del servidor: 10.4.10-MariaDB
-- Versión de PHP: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `rentas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `admin`
--

CREATE TABLE `admin` (
  `idadmin` int(11) NOT NULL,
  `nombreadmin` varchar(128) DEFAULT NULL,
  `teladmin` varchar(10) DEFAULT NULL,
  `passadmin` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `arrendador`
--

CREATE TABLE `arrendador` (
  `idarrendador` int(11) NOT NULL,
  `nombreador` varchar(128) DEFAULT NULL,
  `sexoador` varchar(8) DEFAULT NULL,
  `telador` varchar(10) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `fotoador` longblob DEFAULT NULL,
  `passador` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Disparadores `arrendador`
--
DELIMITER $$
CREATE TRIGGER `eliminar_vivienda` BEFORE DELETE ON `arrendador` FOR EACH ROW BEGIN 
DELETE FROM vivienda WHERE vivienda.arrendador_idarrendador = old.idarrendador;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `arrendatario`
--

CREATE TABLE `arrendatario` (
  `idarrendatario` int(11) NOT NULL,
  `nombretario` varchar(128) DEFAULT NULL,
  `estatus` varchar(16) DEFAULT NULL,
  `sexotario` varchar(8) DEFAULT NULL,
  `fototario` longblob DEFAULT NULL,
  `passtario` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Disparadores `arrendatario`
--
DELIMITER $$
CREATE TRIGGER `eliminar_contrato` BEFORE DELETE ON `arrendatario` FOR EACH ROW BEGIN 
DELETE FROM contrato WHERE contrato.arrendatario_idarrendatario = old.idarrendatario; 
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contrato`
--

CREATE TABLE `contrato` (
  `idcontrato` int(11) NOT NULL,
  `duracion` int(11) DEFAULT NULL,
  `montocon` varchar(5) DEFAULT NULL,
  `observaciones` varchar(255) DEFAULT NULL,
  `fechainicio` date DEFAULT NULL,
  `fechasig` date DEFAULT NULL,
  `vivienda_idvivienda` int(11) NOT NULL,
  `arrendatario_idarrendatario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Disparadores `contrato`
--
DELIMITER $$
CREATE TRIGGER `eliminar_pago` BEFORE DELETE ON `contrato` FOR EACH ROW BEGIN 
DELETE FROM pago WHERE pago.contrato_idcontrato = old.idcontrato;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago`
--

CREATE TABLE `pago` (
  `idpago` int(11) NOT NULL,
  `fechapago` date DEFAULT NULL,
  `monto` int(11) DEFAULT NULL,
  `contrato_idcontrato` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `renta`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `renta` (
`idarrendatario` int(11)
,`nombretario` varchar(128)
,`estatus` varchar(16)
,`sexotario` varchar(8)
,`fototario` longblob
,`nombreador` varchar(128)
,`sexoador` varchar(8)
,`telador` varchar(10)
,`direccion` varchar(255)
,`fotoador` longblob
,`tipo` varchar(16)
,`detalles` varchar(255)
,`fotoviv` longblob
);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `solicitudes`
--

CREATE TABLE `solicitudes` (
  `idsolicitud` int(11) NOT NULL,
  `nombresol` varchar(128) DEFAULT NULL,
  `sexosol` varchar(8) DEFAULT NULL,
  `fotosol` longblob DEFAULT NULL,
  `idviv` int(11) DEFAULT NULL,
  `passsol` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vivienda`
--

CREATE TABLE `vivienda` (
  `idvivienda` int(11) NOT NULL,
  `tipo` varchar(16) DEFAULT NULL,
  `fotoviv` longblob DEFAULT NULL,
  `detalles` varchar(255) DEFAULT NULL,
  `arrendador_idarrendador` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Disparadores `vivienda`
--
DELIMITER $$
CREATE TRIGGER `eliminar_contrato_again` BEFORE DELETE ON `vivienda` FOR EACH ROW BEGIN 
DELETE FROM contrato WHERE contrato.vivienda_idvivienda = old.idvivienda; 
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura para la vista `renta`
--
DROP TABLE IF EXISTS `renta`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `renta`  AS  select `arrendatario`.`idarrendatario` AS `idarrendatario`,`arrendatario`.`nombretario` AS `nombretario`,`arrendatario`.`estatus` AS `estatus`,`arrendatario`.`sexotario` AS `sexotario`,`arrendatario`.`fototario` AS `fototario`,`arrendador`.`nombreador` AS `nombreador`,`arrendador`.`sexoador` AS `sexoador`,`arrendador`.`telador` AS `telador`,`arrendador`.`direccion` AS `direccion`,`arrendador`.`fotoador` AS `fotoador`,`vivienda`.`tipo` AS `tipo`,`vivienda`.`detalles` AS `detalles`,`vivienda`.`fotoviv` AS `fotoviv` from (((`arrendatario` join `arrendador`) join `vivienda`) join `contrato`) where `contrato`.`arrendatario_idarrendatario` = `arrendatario`.`idarrendatario` and `contrato`.`vivienda_idvivienda` = `vivienda`.`idvivienda` and `vivienda`.`arrendador_idarrendador` = `arrendador`.`idarrendador` ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`idadmin`);

--
-- Indices de la tabla `arrendador`
--
ALTER TABLE `arrendador`
  ADD PRIMARY KEY (`idarrendador`);

--
-- Indices de la tabla `arrendatario`
--
ALTER TABLE `arrendatario`
  ADD PRIMARY KEY (`idarrendatario`);

--
-- Indices de la tabla `contrato`
--
ALTER TABLE `contrato`
  ADD PRIMARY KEY (`idcontrato`),
  ADD KEY `fk_contrato_vivienda1_idx` (`vivienda_idvivienda`),
  ADD KEY `fk_contrato_arrendatario1_idx` (`arrendatario_idarrendatario`);

--
-- Indices de la tabla `pago`
--
ALTER TABLE `pago`
  ADD PRIMARY KEY (`idpago`),
  ADD KEY `fk_pago_contrato1_idx` (`contrato_idcontrato`);

--
-- Indices de la tabla `solicitudes`
--
ALTER TABLE `solicitudes`
  ADD PRIMARY KEY (`idsolicitud`);

--
-- Indices de la tabla `vivienda`
--
ALTER TABLE `vivienda`
  ADD PRIMARY KEY (`idvivienda`),
  ADD KEY `fk_vivienda_arrendador1_idx` (`arrendador_idarrendador`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `admin`
--
ALTER TABLE `admin`
  MODIFY `idadmin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `arrendador`
--
ALTER TABLE `arrendador`
  MODIFY `idarrendador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `arrendatario`
--
ALTER TABLE `arrendatario`
  MODIFY `idarrendatario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `contrato`
--
ALTER TABLE `contrato`
  MODIFY `idcontrato` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT de la tabla `pago`
--
ALTER TABLE `pago`
  MODIFY `idpago` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=60;

--
-- AUTO_INCREMENT de la tabla `solicitudes`
--
ALTER TABLE `solicitudes`
  MODIFY `idsolicitud` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `vivienda`
--
ALTER TABLE `vivienda`
  MODIFY `idvivienda` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `contrato`
--
ALTER TABLE `contrato`
  ADD CONSTRAINT `fk_contrato_arrendatario1` FOREIGN KEY (`arrendatario_idarrendatario`) REFERENCES `arrendatario` (`idarrendatario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_contrato_vivienda1` FOREIGN KEY (`vivienda_idvivienda`) REFERENCES `vivienda` (`idvivienda`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `pago`
--
ALTER TABLE `pago`
  ADD CONSTRAINT `fk_pago_contrato1` FOREIGN KEY (`contrato_idcontrato`) REFERENCES `contrato` (`idcontrato`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `vivienda`
--
ALTER TABLE `vivienda`
  ADD CONSTRAINT `fk_vivienda_arrendador1` FOREIGN KEY (`arrendador_idarrendador`) REFERENCES `arrendador` (`idarrendador`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
