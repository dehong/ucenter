SELECT *
FROM t_role
WHERE id IN (
  SELECT role_id
  FROM t_role_user t1, (
                         SELECT u_id
                         FROM t_user
                         WHERE user_name = /* userName */'Hong'
                       ) t2
  WHERE t1.user_id = t2.u_id
)